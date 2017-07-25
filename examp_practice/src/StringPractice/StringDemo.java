package StringPractice;

public class StringDemo {

	public static void main(String[] args) {
        StringBuilder name = new StringBuilder();
        name.append("senthamil").append("durairaj");
        name.replace(0,5,"THAMIL");
        name.deleteCharAt(7);
        String name1=name.toString();
        System.out.println(name);     
	}

}
// char charAt(int indexValue);
// String substring(int beginValue,int endVlue);
// int length();
//int indexOf(char indexValue)