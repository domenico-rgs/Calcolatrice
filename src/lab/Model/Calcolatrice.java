package lab.Model;

public class Calcolatrice {
	private StringBuilder primo;
	private StringBuilder secondo;
	private String result;
	private double memory;
	private boolean unoOk = false;
	private String op;
	
	public Calcolatrice() {
		primo = new StringBuilder();
		secondo = new StringBuilder();
	}
	
	public String getNum(String num) {
		if(!unoOk)
			return primo.append(num).toString();
		else 
			return secondo.append(num).toString();
	}
	
	public void getOp(String op) {
		this.op=op;
		if(primo.toString().isEmpty())
			primo.append(result);
		unoOk=true;
	}

	public String getDisplay() {
		unoOk=false;
		if(op.equals("+"))
			result=sum().toString();
		else if(op.equals("-"))
			 result=sub().toString();
		else if(op.equals("x"))
			result=mul().toString();
		else
			result=div().toString();
		cancella();
		return result;
		
	}
	
	private Double sum() {
		return daStringADouble(primo.toString())+daStringADouble(secondo.toString());
	}
	
	private Double sub() {
		return daStringADouble(primo.toString())-daStringADouble(secondo.toString());
	}
	
	private Double mul() {
		return daStringADouble(primo.toString())*daStringADouble(secondo.toString());
	}
	
	private Double div() {
		return daStringADouble(primo.toString())/(double)daStringADouble(secondo.toString());

	}
	
	public void resetMemory() {
		memory=0;
	}
	
	public void cancella() {
		primo.setLength(0);
		secondo.setLength(0);
	}
	
	public void addMem(String stringa) {
		memory+=Double.parseDouble(stringa);
	}
	
	public String mR() {
		getNum(((Double)memory).toString());
		return ((Double)memory).toString();
	}
	
	private double daStringADouble(String stringa) {
		return Double.parseDouble(stringa);
	}
	
	public String getPrimo() {
		return primo.toString();
	}

	public String getSecondo() {
		return secondo.toString();
	}
}
