package SearchEX;

public int compare(T d1, T d2) {
	if(d1 > d2) {
		return 양수;
	}
	if(d1 < d2) {
		return 음수;
	}
	if(d1 == d2) {
		return 0;
	}
}
