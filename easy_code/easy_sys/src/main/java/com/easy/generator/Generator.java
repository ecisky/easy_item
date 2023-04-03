package com.easy.generator;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;


public class Generator extends BaseGeneratorTest {


    /**
     * 数据源配置
     */
    private static final DataSourceConfig DATA_SOURCE_CONFIG = new DataSourceConfig
            .Builder("jdbc:mysql://127.0.0.1:3306/easy_item?serverTimezone=Asia/Shanghai", "root", "root@123")
            .schema("easy_item")
            .build();

    public static void main(String[] args) {
//        AutoGenerator generator = new AutoGenerator(DATA_SOURCE_CONFIG);
//        generator.strategy(strategyConfig().build());
//        generator.global(globalConfig().build());
//        generator.execute();
        System.out.println(System.getProperty("user.dir"));
        FastAutoGenerator.create("jdbc:mysql://127.0.0.1:3306/easy_item?serverTimezone=Asia/Shanghai", "root", "root@123")
                .globalConfig(builder -> {
                    builder.author("baomidou") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("D://"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.easy.mapper") // 设置父包名
                            .moduleName("system") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "D://")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("sys") // 设置需要生成的表名
                            .addTablePrefix("t_", "c_"); // 设置过滤表前缀
                })
                //.templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();



    }
}

