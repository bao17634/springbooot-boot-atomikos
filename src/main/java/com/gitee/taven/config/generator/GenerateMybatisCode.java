/**
 *
 */
package com.gitee.taven.config.generator;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yangliu
 *
 */
public class GenerateMybatisCode {
//
//	public static void main(String[] args) {
//
//		//
//		List<String> warnings = new ArrayList<String>();
//		   boolean overwrite = true;
//		   //GenMain.class.getResource("generatorConfig.xml").getFile()
//		   File configFile = new File(GenerateMybatisCode.class.getResource("/generator-mysql.xml").getFile());
//		   ConfigurationParser cp = new ConfigurationParser(warnings);
//		   Configuration config;
//		try {
//			config = cp.parseConfiguration(configFile);
//			  DefaultShellCallback callback = new DefaultShellCallback(overwrite);
//			   MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
//			   myBatisGenerator.generate(null);
//		} catch (IOException | XMLParserException | InvalidConfigurationException | SQLException | InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("========================generate the code sucess.==================");
//
//	}

    public void generator() throws Exception {

        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        //指定逆向工程配置文件
        File configFile = new File(GenerateMybatisCode.class.getResource("/generator-mysql.xml").getFile());
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
                callback, warnings);
        myBatisGenerator.generate(null);

    }
    public static void main(String[] args) throws Exception {
        try {
            GenerateMybatisCode generatorSqlmap = new GenerateMybatisCode();
            generatorSqlmap.generator();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
