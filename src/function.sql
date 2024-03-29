show tables;

desc sungjuk;

select * from sungjuk;

--집계함수(개수 count(), sum(), avg())
select count(*) as cnt from sungjuk;
select count(kor)as 국어건수, sum(kor) as 국어합계, avg(kor)as 국어 평균 from sungjuk;

--최대(max),최소(min)

select max(kor) as 국어 최대 점수, min(kor) as 국어최소점수 from sungjuk;

--문자열 연결 : concat()
select concat(max(kor),'점') as 국어 최대 점수, concat(min(kor),'점') as 국어최소점수 from sungjuk;

--출력용 형식지정: format(필드[,소수이하자리수])
select name, (kor+eng+mat)/3 as 평균 from 

