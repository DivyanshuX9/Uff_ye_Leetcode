class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int armonth=((arriveAlice.charAt(0)-'0')*10+arriveAlice.charAt(1)-'0');
        int ardays=((arriveAlice.charAt(3)-'0')*10+arriveAlice.charAt(4)-'0');

        int amleave=((leaveAlice.charAt(0)-'0')*10+leaveAlice.charAt(1)-'0');
        int adleave=((leaveAlice.charAt(3)-'0')*10+leaveAlice.charAt(4)-'0');

        int brmonth=((arriveBob.charAt(0)-'0')*10+arriveBob.charAt(1)-'0');
        int brdays=((arriveBob.charAt(3)-'0')*10+arriveBob.charAt(4)-'0');

        int bmleave=((leaveBob.charAt(0)-'0')*10+leaveBob.charAt(1)-'0');
        int brleave=((leaveBob.charAt(3)-'0')*10+leaveBob.charAt(4)-'0');

        int month[]={31,28,31,30,31,30,31,31,30,31,30,31};
        int startMonth=Math.max(armonth,brmonth);
        int startDay;
         if(armonth>brmonth)
            startDay=ardays;
        else if(brmonth>armonth)
            startDay=brdays;
        else
            startDay=Math.max(ardays,brdays);

        // Find common ending date
        int endMonth=Math.min(amleave,bmleave);
        int endDay;

        if(amleave<bmleave)
            endDay=adleave;
        else if(bmleave<amleave)
            endDay=brleave;
        else
            endDay=Math.min(adleave,brleave);

        // No overlap
        if(startMonth>endMonth || (startMonth==endMonth && startDay>endDay))
            return 0;

        // Same month
        if(startMonth==endMonth)
            return endDay-startDay+1;

        int ans=month[startMonth-1]-startDay+1;
        for(int i=startMonth+1;i<endMonth;i++)
            ans+=month[i-1];

        ans+=endDay;

        return ans;
    }
}