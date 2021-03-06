package cn.iocoder.mall.productservice.service.spu.bo;

import cn.iocoder.common.framework.vo.PageParam;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
* 商品 SPU 分页 BO
*/
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class ProductSpuPageBO extends PageParam {

    /**
    * SPU 名字
    */
    private String name;
    /**
    * 是否有库存
    */
    private Boolean hasQuantity;

}
