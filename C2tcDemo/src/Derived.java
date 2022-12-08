import tns.day4.package1.Base;

public class Derived extends Base{
	Derived()
	{
		System.out.println("Derived Class Default Constructor");
	//Default members are package specific so unable to access in another package
	//	super.varDefault=101; 
		super.varPublic=201;
		
		//super.varPrivate=301; private members can't inherited 
		super.varProtected=401;		
		super.methodProtected();
	}
}

