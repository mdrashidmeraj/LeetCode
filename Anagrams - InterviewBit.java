public class Solution {
  // DO NOT MODIFY THE LIST. IT IS READ ONLY
  public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
    Map<String, ArrayList<Integer>> map = new HashMap<>();
    for (int i = 0; i < A.size(); i++) {
      String sortedKey = getSortedKey(A.get(i));
      //yeh agar string present nhi hai to map me string put kar ke arraylist return karega jisme hum index 
      //put kar denge.
      map.computeIfAbsent(sortedKey, k -> new ArrayList<>()).add(i + 1);
    }
    return new ArrayList<>(map.values());
  }

  private String getSortedKey(String s) {
    char[] ch = s.toCharArray();
    Arrays.sort(ch);
    return String.valueOf(ch);
  }
}
