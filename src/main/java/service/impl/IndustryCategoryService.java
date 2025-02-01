package service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import entity.IndustryCategory;
import entity.PageResultIndustryCategoryRespVO;

public interface IndustryCategoryService extends IService<IndustryCategory> {

    boolean createIndustryCategory(IndustryCategory industryCategory);

    boolean updateIndustryCategory(IndustryCategory industryCategory);

    boolean deleteIndustryCategory(Integer id);

    IndustryCategory getIndustryCategoryById(Integer id);

    PageResultIndustryCategoryRespVO listIndustryCategoryWithPage(int currentPage, int pageSize);
}
