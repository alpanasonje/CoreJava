/**
 * 
 */
package lesson6.override;

import java.util.Date;

public class SuppressWarningsDemo {
	/**
	 * @param args
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		SuppressWarningsDemo annotationDemo=new SuppressWarningsDemo();
		annotationDemo.getData();
		Date date=new Date();
		date.getDate();
		

	}
	@Deprecated
	public void getData()
	{
		
	}
	public void getNewData()
	{
		
	}
}
