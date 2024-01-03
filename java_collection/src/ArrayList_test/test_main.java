package ArrayList_test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class test_main {
	public static void main(String[] args) {
		ArrayList<food> menu = load();
		for(int i=0;i<menu.size();i++) {
			System.out.println(menu.get(i));
		}
	}
	public static ArrayList<food> load(){
		ArrayList<food> menu = new ArrayList<food>();
		try(BufferedReader bf = new BufferedReader(new FileReader("c:/test/food.txt"))){
			while(true) {
				String line = bf.readLine();
				if(line==null) break;
				String[] tmp = line.split("-");
				food data = new food(tmp[0], Integer.parseInt(tmp[1]),tmp[2]);
				menu.add(data);
			}
		}catch(Exception e) {
			System.out.println("파일로드 및 반환실패");
			e.printStackTrace();
		}
		return menu;
	}
	
}
