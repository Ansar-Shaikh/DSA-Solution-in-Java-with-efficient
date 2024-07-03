class  mostWordsFound {
    public int mostWordsFound(String[] sentences) {
        int n=sentences.length;
        int count=0;
        for (int i=0;i<n;i++){
            int largest=sentences[i].split(" ").length;
            count=Math.max(count,largest);
           
        }
        return count;
        
    }
	public static void main(String []args){
		String sentences={"i love u ","happy dsa jounry with fun","failure is first step of success"};
		System.out.println(mostWordsFound( sentences) );

	}
}
