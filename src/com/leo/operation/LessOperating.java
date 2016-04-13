package com.leo.operation;

/**
 * @author leo 
 *  email: longhaogao@gmail.com
 *
 * @date Apr 12, 2016
 * @version 1.0
 */
public class LessOperating implements IOperation {

	@Override
	public boolean operate(String s1, String s2) {
		if(s1.compareToIgnoreCase(s2) < 0){
			return true;
		}
		return false;
	}

}
