import java.util.*;

class Solution {
    public String[] solution(String[] record) {

        Map<String,String> ids = new HashMap<String,String>();
        for (String items : record) {
            if (Arrays.asList(items.split(" ")).size() > 2) {
                ids.put(Arrays.asList(items.split(" ")).get(1), Arrays.asList(items.split(" ")).get(2));
            }
        }
        
        List<String> results = new ArrayList();    
        
        for (String items : record) {
            String inputNickName = ids.get(Arrays.asList(items.split(" ")).get(1));
            if (Arrays.asList(items.split(" ")).get(0).equals("Enter")) {
                results.add(inputNickName + "님이 들어왔습니다.");
            } else if (Arrays.asList(items.split(" ")).get(0).equals("Leave")) {
                results.add(inputNickName + "님이 나갔습니다.");
            }
        }
        
        return results.toArray(new String[results.size()]);
    }
}