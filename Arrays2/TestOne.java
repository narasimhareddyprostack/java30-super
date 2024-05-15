class Test{
    public static void main(String[] args) {
        int[] a=new int[4];
        String[] enames=new String[4];
        float[] salaries=new float[4];
        boolean[] avail=new boolean[4];
        Object[] obj=new Object[4];
        System.out.println(a);
        System.out.println(enames);
        System.out.println(salaries);
        System.out.println(avail);
        System.out.println(obj);

        System.out.println(a[0]);  //0
        System.out.println(enames[0]);//null
        System.out.println(salaries[0]);//0.0
        System.out.println(avail[0]);//false
        System.out.println(obj[0]); //null
    }
}