package Hello_world;

import java.util.UUID;

public class CoffeeShop {
	
	String[] userIDs = new String[9999];
	
	//배열 인덱스
	int index;
	//회원가입 기능
	void joinMember(exampleOOP exampleOOP) {
		//user ID 발급받기
		//참조 변수
		String uID = UUID.randomUUID().toString();
		userIDs[index] = uID;
		exampleOOP.name = uID;
		index++;
	}
}
