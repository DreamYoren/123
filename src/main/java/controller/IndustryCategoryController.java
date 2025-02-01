package controller;

import entity.IndustryCategory;
import entity.PageResultIndustryCategoryRespVO;
import org.springframework.beans.factory.annotation.Autowired;
import service.impl.IndustryCategoryService;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
import java.util.HashMap;
import org.springframework.http.*;

@RestController
@RequestMapping
public class IndustryCategoryController {

    @Autowired
    IndustryCategoryService industryCategoryService;

    @PutMapping
    public ResponseEntity<Map<String,Object>>
    update(@RequestParam Integer id,@RequestParam String name){
        IndustryCategory industryCategory = new IndustryCategory();
        industryCategory.setId(id);
        industryCategory.setName(name);
        boolean success = industryCategoryService.updateIndustryCategory(industryCategory);
        Map<String,Object> result = new HashMap<>();
        result.put("code",success?0:-1);
        result.put("data",success);
        result.put("msg",success?"更新成功":"更新失败");
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Map<String,Object>>
    create(@RequestParam String name){
        IndustryCategory industryCategory = new IndustryCategory();
        industryCategory.setName(name);
        boolean success = industryCategoryService.createIndustryCategory(industryCategory);
        Map<String,Object> result = new HashMap<>();
        result.put("code",success?0:-1);
        result.put("data",success);
        result.put("msg",success?"创建成功":"创建失败");
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<Map<String,Object>>
    get(@RequestParam Integer pageNo,@RequestParam Integer pageSize){
        PageResultIndustryCategoryRespVO pageResult = industryCategoryService.listIndustryCategoryWithPage(pageNo,pageSize);
        Map<String,Object> result = new HashMap<>();
        result.put("code",0);
        result.put("data",pageResult);
        result.put("msg","查询成功");
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    //ID
    @GetMapping
    public ResponseEntity<Map<String,Object>>
    get(@RequestParam Integer id){
        IndustryCategory industryCategory = industryCategoryService.getIndustryCategoryById(id);
        Map<String,Object> result = new HashMap<>();
        result.put("code",industryCategory!=null?0:-1);
        result.put("data",industryCategory);
        result.put("msg",industryCategory!=null?"查询成功":"未找到数据");
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<Map<String,Object>>
    delete(@RequestParam Integer id){
        boolean success = industryCategoryService.deleteIndustryCategory(id);
        Map<String,Object> result = new HashMap<>();
        result.put("code",success?0:-1);
        result.put("data",success);
        result.put("msg",success?"删除成功":"删除失败");
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
