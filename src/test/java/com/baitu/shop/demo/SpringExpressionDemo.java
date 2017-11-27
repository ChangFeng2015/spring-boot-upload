//package com.baitu.shop.demo;
//
//import org.junit.Test;
//import org.springframework.expression.EvaluationContext;
//import org.springframework.expression.Expression;
//import org.springframework.expression.ExpressionParser;
//import org.springframework.expression.spel.SpelParserConfiguration;
//import org.springframework.expression.spel.standard.SpelExpression;
//import org.springframework.expression.spel.standard.SpelExpressionParser;
//import org.springframework.expression.spel.support.StandardEvaluationContext;
//
//import java.util.Date;
//import java.util.GregorianCalendar;
//import java.util.List;
//
///**
// * spring EL表达式测试
// *
// * @author Dave
// * @create 2017-11-16 22:48
// **/
//
//public class SpringExpressionDemo {
//
//    @Test
//    public void test() {
//        ExpressionParser parser = new SpelExpressionParser();
//        Expression expression = parser.parseExpression("'hello world'.bytes.length");
////        String messge = (String) expression.getValue();
//        Integer len = (Integer) expression.getValue();
//        System.out.println(len);
//
//        GregorianCalendar c = new GregorianCalendar();
//        c.set(1856, 7, 9);
//
//        Inventor tesla = new Inventor("Nikola Tesla", c.getTime(), "Serbian");
//
//        expression = parser.parseExpression("birthday");
//
//        EvaluationContext context = new StandardEvaluationContext(tesla);
//        Date name = (Date) expression.getValue(context);
//        System.out.println(name);
//
//        SpelParserConfiguration config = new SpelParserConfiguration(true, true);
//        parser = new SpelExpressionParser(config);
//
//        expression = parser.parseExpression("list[4]");
//
//        Demo demo = new Demo();
//        Object o = expression.getValue(demo);
//
//        System.out.println(o);
//    }
//
//
//}
//
//class Demo {
//    public List<String> list;
//}
