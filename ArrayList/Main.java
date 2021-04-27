import java.util.ArrayList;

class Main{
	public static void main(String []args){
		ArrayListvsTable.ArrayListvsTable();
		ArrayList<DaneOsobowe> listOfDaneOsobowe = new ArrayList();
        DaneOsobowe do1= new DaneOsobowe("Anna","Kowalska",20,150,59);
        DaneOsobowe do2=new DaneOsobowe("Karol","Nowak",24,180,89);

        listOfDaneOsobowe.add(do1);
        listOfDaneOsobowe.add(do2);
        for(int i=0;i<listOfDaneOsobowe.size();i++){
            System.out.println(listOfDaneOsobowe.get(i).bmi()+"\n");
        }
}