package com.byr.config;

import javax.sql.DataSource;
import javax.transaction.TransactionManager;
import javax.transaction.UserTransaction;

import com.atomikos.icatch.jta.UserTransactionImp;
import com.atomikos.icatch.jta.UserTransactionManager;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.jta.JtaTransactionManager;
import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jta.atomikos.AtomikosDataSourceBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.byr.config.prop.MysqlProperties;
import com.byr.utils.PojoUtil;

@Configuration
@MapperScan(value = "com.byr.myselfdemo.mapper.postgresql_mapper",basePackages = PostgreSqlDataSourceConfig.PACKAGE, sqlSessionFactoryRef = "businessSqlSessionFactory")
public class PostgreSqlDataSourceConfig {

	static final String PACKAGE = "com.byr.myselfdemo.mapper.postgresql_mapper";
	@Autowired
	private MysqlProperties mysqlProperties;

    /**
     * 配置数据源
     * @return
     */
	@Bean(name = "businessDataSource")
    public DataSource businessDataSource() {
        AtomikosDataSourceBean ds = new AtomikosDataSourceBean();
        ds.setXaProperties(PojoUtil.obj2Properties(mysqlProperties));
        ds.setXaDataSourceClassName("com.alibaba.druid.pool.xa.DruidXADataSource");
        ds.setUniqueResourceName("businessProperties");
        ds.setPoolSize(5);
		ds.setTestQuery("SELECT 1");
        return ds;
    }

	@Bean
	public SqlSessionFactory businessSqlSessionFactory() throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().
                getResources("classpath*:com/byr/myselfdemo/mapper/postgresql_mapper/mapper_xml/*.xml"));
		sqlSessionFactoryBean.setDataSource(businessDataSource());
		return sqlSessionFactoryBean.getObject();
	}

    /**
     * 配置spring的JtaTransactionManager，底层委派给atomikos进行处理
     * @return
     * @throws Throwable
     */
    @Bean(name = "transactionManager")
    @DependsOn({"userTransaction", "atomikosTransactionManager"})
    public PlatformTransactionManager transactionManager() throws Throwable {
        UserTransaction userTransaction = userTransaction();
        TransactionManager atomikosTransactionManager = atomikosTransactionManager();
        JtaTransactionManager jtaTransactionManager = new JtaTransactionManager(userTransaction, atomikosTransactionManager);
        jtaTransactionManager.setAllowCustomIsolationLevels(true);
        return jtaTransactionManager;
    }

    /**
     * 配置atomikos事务管理
     * @return
     * @throws Throwable
     */
    @Bean(name = "atomikosTransactionManager")
    public TransactionManager atomikosTransactionManager() throws Throwable {
        try{
            UserTransactionManager userTransactionManager = new UserTransactionManager();
            userTransactionManager.setForceShutdown(true);
            return userTransactionManager;
        }catch (Throwable e){
            throw new Throwable(e);
        }
    }
    /**
     * 配置atomikos事务管理
     * @return
     * @throws Throwable
     */
    @Bean(name = "userTransaction")
    public UserTransaction userTransaction() throws Throwable {
        UserTransactionImp userTransactionImp = new UserTransactionImp();
        userTransactionImp.setTransactionTimeout(10000);
        return userTransactionImp;
    }

}
