package com.example.restaurant.naver;


import com.example.restaurant.naver.dto.SearchImageReq;
import com.example.restaurant.naver.dto.SearchImageRes;
import com.example.restaurant.naver.dto.SearchLocalReq;
import com.example.restaurant.naver.dto.SearchLocalRes;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Component
public class NaverClient {

    @Value("${naver.client.id}")
    private String naverClientId;

    @Value("${naver.client.secret}")
    private String naverClientSecret;

    @Value("${naver.url.search.local}")
    private String naverLocalSearchUrl;

    @Value("${naver.url.search.image}")
    private String naverImagesearchUrl;


    //public void 로 시작 이후 객체명으로 바꿔줌줌
   public SearchLocalRes searchLocal(SearchLocalReq searchLocalReq){
        var uri = UriComponentsBuilder.fromUriString(naverLocalSearchUrl)
                .queryParams(searchLocalReq.toMultiValueMap()) //queryParam 이아니라 s 붙음 여러개가 들어있는걸 주니까
                .build()
                .encode()
                .toUri();
        //요청 주소 만들기

        var headers = new HttpHeaders();
        headers.set("X-Naver-Client-Id",naverClientId);
        headers.set("X-Naver-Client-Secret",naverClientSecret);
        headers.setContentType(MediaType.APPLICATION_JSON);
        // 헤더부분분

        var httpEntity = new HttpEntity<>(headers);
        //리퀘스트

        var responseType = new ParameterizedTypeReference<SearchLocalRes>(){};

        //리스폰스 타입

        var responseEntity = new RestTemplate().exchange(
                uri,
                HttpMethod.GET,
                httpEntity,
                responseType
        );
        //레스트템플릿통해서 결과 가져오기기


        return responseEntity.getBody();//결과 보내줌
    }

    public SearchImageRes searchImage(SearchImageReq searchImageReq){
        var uri = UriComponentsBuilder.fromUriString(naverImagesearchUrl)
                .queryParams(searchImageReq.toMultiValueMap()) //queryParam 이아니라 s 붙음 여러개가 들어있는걸 주니까
                .build()
                .encode()
                .toUri();
        //요청 주소 만들기

        var headers = new HttpHeaders();
        headers.set("X-Naver-Client-Id",naverClientId);
        headers.set("X-Naver-Client-Secret",naverClientSecret);
        headers.setContentType(MediaType.APPLICATION_JSON);
        // 헤더부분분

        var httpEntity = new HttpEntity<>(headers);
        //리퀘스트

        var responseType = new ParameterizedTypeReference<SearchImageRes>(){};

        //리스폰스 타입

        var responseEntity = new RestTemplate().exchange(
                uri,
                HttpMethod.GET,
                httpEntity,
                responseType
        );
        //레스트템플릿통해서 결과 가져오기기


        return responseEntity.getBody();//결과 보내줌
    }

}
