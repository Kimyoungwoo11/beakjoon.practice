import java.util.ArrayList;
import java.util.Comparator;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
    	ArrayList<int[]> result = new ArrayList<>();
    	int extIndex = getIndex(ext);
    	for (int i = 0; i < data.length; i++) {
			if (data[i][extIndex] < val_ext) {
				result.add(data[i]);
			}
		}
    	int sortIndex = getIndex(sort_by);
    	result.sort(Comparator.comparingInt(a -> a[sortIndex]));
        int[][] answer = new int[result.size()][4];
        for (int i = 0; i < result.size(); i++) {
			answer[i] = result.get(i);
		}
        return answer;
    }
    // ext나 sort_by에 따라 인덱스를 반환하는 함수
    private int getIndex(String key) {
        switch (key) {
            case "code": return 0;
            case "date": return 1;
            case "maximum": return 2;
            case "remain": return 3;
        }
		return 0;
    }
}