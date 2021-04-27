class DaneOsobowe{
	private String imie = "";
	private String nazwisko = "";
	private int wiek = 0;
	private int wzrost = 0;
	private int waga = 0;
	
	public DaneOsobowe(String imie, String nazwisko, int wiek, int wzrost, int waga){
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.wiek = wiek;
		this.wzrost = wzrost;
		this.waga = waga;
	}
    public double bmi(){
        double bmi=0;
        bmi = (double)weight/(height*height)*10000;
        return bmi;
    }
    public int yearOfBirthday(){
        Date d= new Date();
        int year =d.getYear()+1900;
        return year-wiek;
    }

     @Override
     public String toString(){
        return "DaneOsobowe:" +"\n"+
                "name='" + name + '\''+"\n"+
                "lastname='" + lastname + '\'' +"\n"+
                "age=" + age +"\n"+
                "height=" + height +"\n"+
                "weight=" + weight;
    }

}