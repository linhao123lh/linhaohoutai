package com.teamsking.api.endpoint.course;

import com.teamsking.api.dto.course.AddFirstCourseCategoryDto;
import com.teamsking.api.dto.course.CourseCategoryDto;
import com.teamsking.api.dto.course.CourseCategoryDtoMapper;
import com.teamsking.api.dto.course.CourseCategoryNameDto;
import com.teamsking.api.endpoint.BaseController;
import com.teamsking.domain.entity.course.CourseCategory;
import com.teamsking.domain.service.course.CourseCategoryService;
import com.teamsking.util.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
*@author linhao
*/

@RestController
@Api(tags = "课程模板分类接口")
@Slf4j
public class CourseCategoryController extends BaseController {

    @Autowired
    CourseCategoryService courseCategoryService;


    @ApiOperation(value = "一级课程模板分类列表", notes = "可分页", produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNo", value = "页码", required = true, example = "1"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, example = "10")
    })
    @GetMapping("/course_categorys")
    public Result list(@RequestParam int pageNo, @RequestParam int pageSize){

        return Result.success().addData("pager",warpPage(courseCategoryService.list(fixPage(pageNo),fixPage(pageSize))));
    }


    @ApiOperation(value = "获取二级课程模板分类", produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "一级课程模板分类主键", required = true, dataType = "int")
    })
    @GetMapping("/course_category/{id}")
    public Result getSecondCourseCategory(@PathVariable int id){

        List<CourseCategoryDto> courseCategoryDtoList = courseCategoryService.getSecondCourseCategory(id);
        return Result.success().addData("courseCategoryDtoList",courseCategoryDtoList);
    }


    @ApiOperation(value = "新增二级课程模板分类", consumes = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "courseCategoryDto", value = "二级课程模板分类信息", required = true, dataType = "CourseCategoryDto"),
            @ApiImplicitParam(name = "id", value = "一级课程模板分类主键", required = true, dataType = "int")
    })
    @PostMapping("/second_course_category/{id}")
    public Result addSecondCourseCategory(@RequestBody CourseCategoryDto courseCategoryDto,
                                          @PathVariable int id){

        courseCategoryService.saveSecondCourseCategory(courseCategoryDto,id);
        return Result.success();
    }


    @ApiOperation(value = "编辑课程模板分类", consumes = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "courseCategoryDto", value = "二级课程模板分类信息", required = true, dataType = "CourseCategoryDto"),
            @ApiImplicitParam(name = "id", value = "一级课程模板分类主键", required = true, dataType = "int")
    })
    @PutMapping("/course_category/{id}")
    public Result modify(@RequestBody CourseCategoryDto courseCategoryDto,
                                          @PathVariable int id){

        courseCategoryService.modifyCourseCategory(courseCategoryDto,id);
        return Result.success();
    }


    @ApiOperation(value = "批量删除课程模板分类", consumes = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "ids", value = "一级课程模板分类主键", required = true, dataType = "Integer[]")
    })
    @DeleteMapping("/course_category/multi_delete")
    public Result removeMultiCourseCategory(@RequestParam Integer[] ids){

        courseCategoryService.removeCourseCategoryByIds(ids);
        return Result.success();
    }


    @ApiOperation(value = "删除课程模板分类", consumes = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "一级课程模板分类主键", required = true, dataType = "int")
    })
    @DeleteMapping("/course_category/{id}")
    public Result remove(@PathVariable int id){

        courseCategoryService.removeCourseCategory(id);
        return Result.success();
    }


    @ApiOperation(value = "是否显示课程模板分类", produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "课程模板分类的主键", required = true, dataType = "int"),
            @ApiImplicitParam(name = "courseCategoryDto", value = "课程模板分类", required = true, dataType = "CourseCategoryDto")
    })
    @PutMapping("/course_category/is_show/{id}")
    public Result isShowCourseCategory(@PathVariable("id") int id,
                                       @RequestBody CourseCategoryDto courseCategoryDto){

        courseCategoryService.isShowById(courseCategoryDto,id);
        return Result.success();
    }


    @ApiOperation(value = "创建课程模板: 一级分类列表", consumes = "application/json")
    @GetMapping("/first_course_categories")
    public Result getFirstCategory(){

        List<CourseCategory> courseCategoryList = courseCategoryService.getAllFirstCategory();
        List<CourseCategoryNameDto> courseCategoryNameDtoList = CourseCategoryDtoMapper.INSTANCE.entityListToNameDtoList(courseCategoryList);
        return Result.success().addData("firstCourseCategoryList",courseCategoryNameDtoList);
    }


    @ApiOperation(value = "创建课程模板: 二级分类列表", consumes = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "分类的主键", required = true, dataType = "int")
    })
    @GetMapping("/second_course_categories/{id}")
    public Result getSecondCategory(@PathVariable("id") int id){

        List<CourseCategory> courseCategoryList = courseCategoryService.getSecondCategoryById(id);
        List<CourseCategoryNameDto> courseCategoryNameDtoList = CourseCategoryDtoMapper.INSTANCE.entityListToNameDtoList(courseCategoryList);
        return Result.success().addData("secondCourseCategoryList",courseCategoryNameDtoList);
    }

    @ApiOperation(value = "创建一级课程模板分类接口", consumes= "application/json")
    @ApiImplicitParams( {
            @ApiImplicitParam(name = "addCourseCategory", value = "一级课程模板分类", required = true, dataType = "AddFirstCourseCategoryDto")
    })
    @PostMapping("/course_category")
    public Result addCategory(@RequestBody AddFirstCourseCategoryDto addCourseCategory){

        CourseCategory courseCategory = CourseCategoryDtoMapper.INSTANCE.addDtoToEntity(addCourseCategory);
        courseCategoryService.saveFirstCourseCategory(courseCategory);
        return Result.success();

    }

}
