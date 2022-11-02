package java_khjInstance;

class AccessWay {
	static int num = 0;

	AccessWay() {
		incrCnt();
	}

	void incrCnt() {
		num++; // 클래스 내부에서 이름을 통한 접근
	}
}

class ClassVarAccess {
	public static void main(String[] arg) {
		AccessWay way = new AccessWay();
		way.num++; // 외부에서 인스턴스의 이름을 통한 접근
		AccessWay.num++; // 외부에서 클래스의 이름을 통한 접근
		System.out.println("num = " + AccessWay.num);
	}
}
