package com.jocata.A__JAXB;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.jocata.A__JAXB.model.OfflinePaperlessKyc;
import com.jocata.A__JAXB.model.Student;

public class App 
{
    
	public static void main(String[] args) 
	{
		try 
		{
			
			/*File file = new File("C:\\lekha_data\\test.xml"); 
			 
			JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
				
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
				
			Student student = (Student) unmarshaller.unmarshal(file);

			System.out.println(student.getId());
			System.out.println(student.getFirstName());
			System.out.println(student.getLastName());*/
			
			File file = new File("C:\\lekha_data\\Kyc.xml"); 
			 
			JAXBContext jaxbContext = JAXBContext.newInstance(OfflinePaperlessKyc.class);
				
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
				
			OfflinePaperlessKyc kyc = (OfflinePaperlessKyc) unmarshaller.unmarshal(file);

			System.out.println(kyc.getReferenceId());
			System.out.println(kyc.getUidData());
			
			/*System.out.println(kyc.getUidData().getPoa());
			System.out.println(kyc.getUidData().getPoi());
			System.out.println(kyc.getUidData().getPht()); */
				
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
