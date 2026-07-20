import java.util.*;
class SquareofSortedArray{
    private static int[] square(int[] arr){
        int n = arr.length;
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(arr[i]>0){
                pos.add(arr[i]);
            }else{
                neg.add(arr[i]);
            }
        }

        if(neg.size()==0){
            for(int i=0;i<pos.size();i++){
                pos.set(i,pos.get(i)*pos.get(i));
            }
            return pos.stream().mapToInt(Integer::intValue).toArray();
        }
        if(pos.size()==0){
            for(int i=0;i<neg.size();i++){
                neg.set(i,neg.get(i)*neg.get(i));
            }
            Collections.reverse(neg);
            return neg.stream().mapToInt(Integer::intValue).toArray();
        }
        for(int i=0;i<pos.size();i++){
            pos.set(i,pos.get(i)*pos.get(i));
        }

        for(int i=0;i<pos.size();i++){
            neg.set(i,neg.get(i)*neg.get(i));
        }
        Collections.reverse(neg);

        int i = 0, j = 0, k = 0;
        int n1 = pos.size();
        int n2 = neg.size();
        int[] res = new int[n1+n2];
        while(i<n1 && j<n2){
            if(pos.get(i)<neg.get(j)){
                res[k] = pos.get(i);
                i++;
                k++;
            }else{
                res[k] = neg.get(j);
                k++;
                j++;
            }
        }
        while(i<n1){
            res[k] = pos.get(i);
            k++;
            i++;
        }
        while(j<n2){
            res[k] = neg.get(i);
            k++;
            j++;
        }
        return res;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int[] ans = square(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}