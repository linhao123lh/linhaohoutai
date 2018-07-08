package com.teamsking.api.dto.open;

import com.teamsking.domain.entity.open.OpenChapter;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
*@author linhao
*/
@Mapper
public interface OpenChapterDtoMapper {


    OpenChapterDtoMapper INSTANCE = Mappers.getMapper(OpenChapterDtoMapper.class);

    List<OpenChapterDto> entityListToDtoList(List<OpenChapter> entityList);

    OpenChapterDto entityToDto(OpenChapter openChapter);

    OpenChapter dtoToEntity(OpenChapterDto openChapterDto);

}
