package com.example.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/* execution: 実行
 * execution(String *..*MainController.input*(..))
 * execution(String *..*)
 * within: 指定の型やパッケージで制限
 * within(com.example.demo.MainController)
 * 
 */
@Component
@Aspect
public class AopComponent {
	@Before("within(com.example.demo.MainController)")
	public void writeBefore(JoinPoint jp) {
		String className = jp.getSignature().getDeclaringType().getSimpleName();
		String methodName = jp.getSignature().getName();
		System.out.println(className +"クラスの"+ methodName +"メソッドを開始します。");
	}
	
	@After("within(com.example.demo.MainController)")
	public void writeAfter(JoinPoint jp) {
		String className = jp.getSignature().getDeclaringType().getSimpleName();
		String methodName = jp.getSignature().getName();
		System.out.println(className +"クラスの"+ methodName +"メソッドを終了します。");
	}
	
	@Around("within(com.example.demo.MainController)")
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		String className = pjp.getSignature().getDeclaringType().getSimpleName();
		String methodName = pjp.getSignature().getName();
	    System.out.println(className +"クラスの"+ methodName + "メソッド around - before !!");   // 前処理
	    Object retVal = pjp.proceed();                            
	    System.out.println(className +"クラスの"+ methodName + "メソッド around - after !!");    // 後処理
	    return retVal;
	}
}
