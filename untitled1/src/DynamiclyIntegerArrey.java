public class DynamiclyIntegerArrey {
    int[] array =new int[6];

    public void add(int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] =value;
                return;
            }
        }
        int[] largeArrey = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            largeArrey[i] = array[i];
        }
        largeArrey[array.length] = value;
        this.array = largeArrey;
    }

    public int remuveAt(int indexOfElement){
        int valueOfElement=array[indexOfElement];
        int[] smollArray = new int[array.length - 1];
        for (int i = 0; i < indexOfElement; i++) {
            smollArray[i] = array[i];
        }
        for (int i = indexOfElement; i < smollArray.length; i++) {
            smollArray[i] = array[i+1];
        }
        this.array = smollArray;
        return valueOfElement;
    }

    public void addAt(int index,int value) {
        if(index > array.length){
            System.out.println("eror");
        }else {
            int[] largeArrey = new int[array.length + 1];
            for (int i = 0; i < index; i++) {
                largeArrey[i] = array[i];
            }
            largeArrey[index] = value;
            for (int i = index+1; i < largeArrey.length; i++) {
                largeArrey[i] = array[i - 1];
            }
            this.array = largeArrey;
        }
    }


    public void remove(int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value){
                int[] smollArray = new int[array.length - 1];
                for (int j = 0; j < i ; j++) {
                    smollArray[j] = array[j];
                }
                for (int j = i; j < smollArray.length; j++) {
                    smollArray[j] = array[j+1];
                }
                this.array = smollArray;
                i--;
            }
        }
    }
}
