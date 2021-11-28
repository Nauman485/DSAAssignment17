package geekster;

public class Jewels_Stones {
	
	public int numJewelsInStones(String jewels, String stones) {
        int ans = 0;
        
        for (int i = 0; i < stones.length(); i++) {
            if (jewels.contains(String.valueOf(stones.charAt(i)))) {
                ans += 1;
            }
        }
        return ans;
    }
	 public static void main(String args[]) {
	    	String jewels="Aa";
	        String stones="aAAbb";
	        Jewels_Stones ob=new Jewels_Stones();
	    	System.out.print(ob.numJewelsInStones(jewels,stones));
	    }

}
