package com.easy.config;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class AopConfig {
    private static final Logger log = LoggerFactory.getLogger(AopConfig.class);

    /**
     * 指定切入点表达式
     * public * com.easy.modules.*.controller..*(..))
     */
    @Pointcut("execution( * com.easy.controller..*(..))")
    public void getMethods() {

    }


    /***
     * 方法执行之前切入控制层
     * @param joinPoint
     */
    @Before(value = "getMethods()")
    public void doBefore(JoinPoint joinPoint) {
        log.info("4、@Before :前置通知：方法执行前执行...");
    }

    //返回通知
    @AfterReturning(returning = "ret", pointcut = "getMethods()")
    public void doAfterReturning(Object ret) throws Throwable {
        // 处理完请求，返回内容
        log.info("5、@AfterReturning: 返回通知：方法的返回值 : " + ret);
    }

    //异常通知
    @AfterThrowing(throwing = "ex", pointcut = "getMethods()")
    public void throwing(JoinPoint jp, Exception ex) {
        log.info("异常、@AfterThrowing:异常通知：方法异常时执行.....");
    }

    /***
     * 方法执行之后
     */
    @After(value = "getMethods()")
    public void doAfter(JoinPoint joinPoint) {
        log.info("6、@after：" + "后置通知：最后且一定执行.....");
    }


    /**
     * 环绕增强切入
     */
    @Around(value = "getMethods()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        //业务操作同 @Before 方式
        //方法执行之前动作，等效于@Before
        log.info("3、@Around 同Before：");
        Object res = point.proceed();
        //方法执行之后动作，等效于@After
        log.info("7、@Around 同After：");
        return res;
    }


}