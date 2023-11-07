ArrayList<Integer> arrayList = new ArrayList<>();
        int num=10;
        for (int a : arr){
            if (num!=a){
                arrayList.add(a);
            }
            num = a;

        }
        int[] answer = new int[arrayList.size()];
        for (int i=0; i<arrayList.size();i++){
            answer[i] = arrayList.get(i).intValue();
        }