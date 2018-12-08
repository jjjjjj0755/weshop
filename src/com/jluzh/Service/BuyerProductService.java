package com.jluzh.Service;

import java.util.ArrayList;

import com.jluzh.Vo.ProductVo;
import com.jluzh.Vo.ResultVo;

public interface BuyerProductService {

	public ResultVo<ArrayList<ProductVo>>  findUpProduct();
}
