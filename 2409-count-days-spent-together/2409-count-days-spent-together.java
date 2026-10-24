class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        Map<String, Integer> value = new HashMap<>();
        value.put("01",0);
        value.put("02",31);
        value.put("03",59);
        value.put("04",90);
        value.put("05",120);
        value.put("06",151);
        value.put("07",181);
        value.put("08",212);
        value.put("09",243);
        value.put("10",273);
        value.put("11",304);
        value.put("12",334);

        int aArrive= value.get(arriveAlice.substring(0,2))  +   Integer.valueOf(arriveAlice.substring(3,5) );
        int aLeave= value.get(leaveAlice.substring(0,2))  +   Integer.valueOf(leaveAlice.substring(3,5) );
        
        int bArrive= value.get(arriveBob.substring(0,2))  +   Integer.valueOf(arriveBob.substring(3,5) );
        int bLeave= value.get(leaveBob.substring(0,2))  +   Integer.valueOf(leaveBob.substring(3,5) );

        int overlap=(Math.min(aLeave,bLeave)-Math.max(aArrive,bArrive));

        if (overlap<0) return 0;
        else return overlap+1;
    }
}