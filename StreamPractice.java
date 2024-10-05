package corejava.strings;
import java.util.*;
import java.util.stream.Collectors;
public class StreamPractice {
	private List<Integer> intlist;
	public StreamPractice() {
		intlist = new ArrayList<>();
		intlist.add(11);
		intlist.add(20);
		intlist.add(41);
		intlist.add(50);
		intlist.add(80);
		intlist.add(56);
		
	}
	public void op() {
		for(int x:intlist) {
			if(x>30) {
				System.out.println(x);
			}
		}
	}
	public void usingstream() {
		intlist.stream().filter(num->num>30).sorted().limit(5).distinct().forEach(x-> System.out.println(x));
		System.out.println("finding squares");
		intlist.stream().map(x->x*x).forEach(data->{
			System.out.println(data);
		});
		List<Integer> incrementList = intlist.stream().map(x->x+5).toList();
		incrementList.forEach(x->{
			System.out.println("IncrementIntegers "+x);
		});
	}
	public void evenList() {
		intlist.stream().filter(x->x%2==0).forEach(num->{
			System.out.println(num);
		});
	}
	public void stringOperations() {
		List<String> strlist = new ArrayList<>();
		strlist.add("spring");
		strlist.add("javascript");
		strlist.add("democlass");
		strlist.add("hellooooo");
		strlist.add("well");
		strlist.add("python");
		strlist.add("hi");
		List<String> strlistmain =strlist.stream().filter(str->str.length()>5).toList();
		strlistmain.forEach(str->{
			System.out.println(str);
		});
	}
	public static void main(String[] args) {
		StreamPractice obj=new StreamPractice();
		//obj.op();
		//obj.usingstream();
		//obj.evenList();
		obj.stringOperations();
	}

}
