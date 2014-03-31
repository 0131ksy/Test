package rabbit.view;

import java.sql.SQLException;

import rabbit.dao.SubwayDAO;
import rabbit.dto.Subway;

public class SubwayTest {
	public static void main(String[] args) {
		
		
		try {
			SubwayDAO SubwayController=new SubwayDAO();
			SubwayController.deleteAllSubway();
			
			System.out.println();
			System.out.println("*** 데이터 추가 ***");
			
			SubwayDAO.insertSubway(new Subway(1,"모란", 0, 1050));
			SubwayController.insertSubway(new Subway(2,"수진", 1, 1050));
			SubwayController.insertSubway(new Subway(3,"신흥", 3, 1050));
			SubwayController.insertSubway(new Subway(4,"단대오거리", 5, 1050));
			SubwayController.insertSubway(new Subway(5,"남한산성입구", 6, 1050));
			SubwayController.insertSubway(new Subway(6,"산성", 9, 1050));
			SubwayController.insertSubway(new Subway(7,"복정", 12, 1050));
			SubwayController.insertSubway(new Subway(8,"장지", 15, 1050));
			SubwayController.insertSubway(new Subway(9,"문정", 16, 1050));
			SubwayController.insertSubway(new Subway(10,"가락시장", 19, 1050));
			SubwayController.insertSubway(new Subway(11,"송파", 20, 1050));
			SubwayController.insertSubway(new Subway(12,"석촌", 22, 1050));
			SubwayController.insertSubway(new Subway(13,"잠실", 24, 1050));
			SubwayController.insertSubway(new Subway(14,"몽촌토성", 26, 1050));
			SubwayController.insertSubway(new Subway(15,"광동구청", 28, 1050));
			SubwayController.insertSubway(new Subway(16,"천호", 30, 1050));
			SubwayController.insertSubway(new Subway(17,"암사", 31, 1050));
			
			System.out.println("\n*** 선택 된 두 역사이 길이 출력 ***");
			System.out.println(SubwayController.subwayLength("암사", "모란"));
			System.out.println(SubwayController.subwayLength("수진", "산성"));
			
			System.out.println("\n*** 선택 된 두 역사이 가격 출력 ***");
			System.out.println(SubwayController.subwayPrice("수진", "모란"));
			System.out.println(SubwayController.subwayPrice("수진", "암사"));
			
			System.out.println("\n*** Subway01 데이터 모두 출력 ***");
			for(int i=0; i<SubwayController.getAllSubway().size(); i++){
				System.out.println(SubwayController.getAllSubway().get(i).toString());
			}
			
			System.out.println("*** Subwayno:3 데이터 출력 ***");
			System.out.println(SubwayController.getOneSubway(3).toString());
			
			System.out.println();
			System.out.println("*** Subwayno:4 데이터 삭제 ***");
			SubwayController.deleteSubway(4);
			
			System.out.println();
			System.out.println("*** Subway01 데이터 모두 출력 ***");
			for(int i=0; i<SubwayController.getAllSubway().size(); i++){
				System.out.println(SubwayController.getAllSubway().get(i).toString());
			}
			
			System.out.println();
			System.out.println("*** 추가된 데이터 출력 ***");
			System.out.println(SubwayController.getOneSubway(1).toString());
			
			System.out.println();
			System.out.println("*** 수정 전 Subwayno:5 데이터 출력 ***");
			System.out.println(SubwayController.getOneSubway(5).toString());
			
			System.out.println("*** Subwayno:7934 데이터 수정 ***");
			SubwayController.updateSubway(new Subway(5, "ucamp"));
			
			System.out.println();
			System.out.println("*** 수정 후 Subwayno:7934 데이터 출력 ***");
			System.out.println(SubwayController.getOneSubway(5).toString());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
