package com.example.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/* execution: 実行
 * execution(String *..*MainController.input*(..))
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
}
