package decorators;

import flowerstore.Bucket;

public class BucketMaterialDecoration extends BucketDecorationGeneral {
    public BucketMaterialDecoration(Bucket bucket){
        super(bucket);
    }

    public String getMaterialDeco(){
        return "Materially Decorated";
    }

    @Override
    public String getDescriptor() {
        return this.wrappee.getDescriptor() + " material";
    }
}
