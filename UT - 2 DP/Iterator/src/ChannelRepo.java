public class ChannelRepo implements Container{

    String[] names = {"sujyot","sakshi","sarthak"};

    private class ChannelIterator implements Iterator{
        private int Index = 0;

        @Override
        public boolean hasNext() {
            if(Index < names.length){
                return true;
            }
            else{
                return false;
            }
        }

        @Override
        public Object next() {
            if (this.hasNext()){
                return names[Index++];
            }
            else{
                return null;
            }
        }

    }

    @Override
    public Iterator getIterator() {
        return new ChannelIterator();
    }
    
}
