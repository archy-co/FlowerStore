package decorators;

import flowerstore.Bucket;

public class BucketPaintingDecoration extends BucketDecorationGeneral {
    public BucketPaintingDecoration(Bucket bucket){
        super(bucket);
    }

    public String getPaintDeco(){
        return "Painted";
    }

    @Override
    public String getDescriptor() {
        return this.wrappee.getDescriptor() + " paint";
    }
}
