class Solution {
    public double average(int[] salary) {
        int max = salary[0];
        int min = salary[0];
        double sum = 0 ;
        for(int i=0;i<salary.length;i++){
            for(int j=0;j<salary.length;j++){
                if(salary[j]<min){
                    min = salary[j];
                }
                if(salary[j]>max){
                    max = salary[j];
                }
                
            }
            sum+=salary[i];
        }
        
        return (sum-max-min)/(salary.length-2);
    }
}
