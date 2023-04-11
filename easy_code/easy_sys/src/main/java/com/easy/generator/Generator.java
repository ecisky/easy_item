package com.easy.generator;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;


public class Generator {

    /**
     * 数据源配置
     */
    private static final DataSourceConfig.Builder DATA_SOURCE_CONFIG = new DataSourceConfig
            .Builder("jdbc:mysql://127.0.0.1:3306/easy_item?serverTimezone=Asia/Shanghai", "root", "root@123");

    /**
     * 执行 run
     */
    public static void main(String[] args) {
        // 项目模块名
        String module = "easy_sys";
        // 一些数据库需要配置schema
        String schema = "";
        // 注释作者名称
        String author = "easy";
        // 包名
        String packageConfig = "com.easy";
        String path = System.getProperty("user.dir")+ "/" + module+"/src/main/java";
        FastAutoGenerator.create(DATA_SOURCE_CONFIG)
                // 数据库配置
                .dataSourceConfig((builder) -> builder.schema(schema))
                // 全局配置
                .globalConfig((builder) -> builder.author(author).outputDir(path).disableOpenDir())
                // 包配置
                .packageConfig((builder) -> builder.parent(packageConfig))
                // 策略配置
                .strategyConfig((builder -> builder.controllerBuilder().enableRestStyle()))
                .strategyConfig((builder -> builder.entityBuilder().enableFileOverride().enableTableFieldAnnotation()))
                /*
                    模板引擎配置，默认 Velocity 可选模板引擎 Beetl 或 Freemarker 或 Enjoy
                   .templateEngine(new BeetlTemplateEngine())
                   .templateEngine(new FreemarkerTemplateEngine())
                   .templateEngine(new EnjoyTemplateEngine())
                 */
                .execute();
    }
}

