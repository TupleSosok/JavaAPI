package jokylionplay.project2024.mappers;

import jokylionplay.project2024.dto.InternshipDTO;
import jokylionplay.project2024.dto.InternshipLessonsDTO;
import jokylionplay.project2024.dto.InternshipUsersDTO;
import jokylionplay.project2024.entities.Internship;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("session")
@Mapper
public interface InternshipMapper {

    InternshipMapper MAPPER = Mappers.getMapper(InternshipMapper.class );

    @Mapping(source = "users", target = "users")
    InternshipUsersDTO toInternshipUsersDTO(Internship s);

    @Mapping(source = "lessons", target = "lessons")
    InternshipLessonsDTO toInternshipLessonsDTO(Internship s);

    Internship toEntity(InternshipUsersDTO s);

    Internship toEntity(InternshipLessonsDTO s);

    Internship toEntity(InternshipDTO s);
    InternshipDTO toDTO(Internship s);

    /**
     *
     * @param data - все данные без связей
     * @param relationships - исходный объект
     * Меняет в существующем объекте все кроме связей
     */
    void toEntityWithExistsRelationships(InternshipDTO data, @MappingTarget Internship relationships);
}