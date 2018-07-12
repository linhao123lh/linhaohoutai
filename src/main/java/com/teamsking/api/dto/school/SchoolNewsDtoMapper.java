package com.teamsking.api.dto.school;

import com.teamsking.domain.entity.school.SchoolNews;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
*@author linhao
*/
@Mapper
public interface SchoolNewsDtoMapper {

    SchoolNewsDtoMapper INSTANCE = Mappers.getMapper(SchoolNewsDtoMapper.class);

    List<SchoolNewsDto> entityListToDtoList(List<SchoolNews> entityList);

    SchoolNewsDto entityToDto(SchoolNews schoolNews);

    SchoolNews dtoToEntity(SchoolNewsDto schoolNewsDto);

}