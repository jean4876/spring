--해당 테이블은 테스트 계정에만 있기 때문에
--개발자가 실수로 운영디비 설정을 사용해도 해당 sql이 정상적으로 실행되지 않으면서
-- 이후에 등장하는 sql들은 실행되지 않는다. populator.setContinueInError(false);
select * from not_exists_in_prd;




-- user 테이블 데이터 전체 지우기
-- delete users; 	--복구가 가능(아카이브 로그를 남김)
truncate table users; -- 복구가 불가능 (아카이브 로그를 남기지 않음)


Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('brown','브라운','brown1234',to_date('2019/08/12','RRRR/MM/DD'),'곰',null,null,null,'brown.png','e:\upload\2019\08\ad385c0d-bfd1-4858-8e11-0d329197760dpng',null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('cony','코니','cony1234',to_date('2019/08/12','RRRR/MM/DD'),'토끼',null,null,null,'cony.png','e:\upload\2019\08\64fff2c4-8cfc-45ee-be49-b5897380199fpng',null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('sally','샐리','sally1234',to_date('2019/08/12','RRRR/MM/DD'),'병아리',null,null,null,'sally.png','e:\upload\2019\09\4271ec94-e52a-4aba-8dc3-ca663c53021apng','/upload/2019/08/sally.png');
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('james','제임스','james1234',to_date('2019/08/12','RRRR/MM/DD'),'제임스',null,null,null,'james.png','e:\upload\2019\09\8306d502-7441-4d6e-b876-d4b8826962b7png',null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('moon','문','moon1234',to_date('2019/08/12','RRRR/MM/DD'),'달',null,null,null,'moon.png','e:\upload\2019\08\5ecad35d-2da0-45ab-b3d4-8b4a607d9180png',null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid1','xusernm1','xuserid1pass',to_date('2019/08/02','RRRR/MM/DD'),'xuseralias1',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid2','xusernm2','xuserid2pass',to_date('2019/07/23','RRRR/MM/DD'),'xuseralias2',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid3','xusernm3','xuserid3pass',to_date('2019/07/13','RRRR/MM/DD'),'xuseralias3',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid4','xusernm4','xuserid4pass',to_date('2019/07/03','RRRR/MM/DD'),'xuseralias4',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid5','xusernm5','xuserid5pass',to_date('2019/06/23','RRRR/MM/DD'),'xuseralias5',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid6','xusernm6','xuserid6pass',to_date('2019/06/13','RRRR/MM/DD'),'xuseralias6',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid7','xusernm7','xuserid7pass',to_date('2019/06/03','RRRR/MM/DD'),'xuseralias7',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid8','xusernm8','xuserid8pass',to_date('2019/05/24','RRRR/MM/DD'),'xuseralias8',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid9','xusernm9','xuserid9pass',to_date('2019/05/14','RRRR/MM/DD'),'xuseralias9',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid10','xusernm10','xuserid10pass',to_date('2019/05/04','RRRR/MM/DD'),'xuseralias10',null,null,null,null,'e:\upload\2019\08\1b120c8d-1800-4fbb-9bc8-62f38a860e69png',null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid11','xusernm11','xuserid11pass',to_date('2019/04/24','RRRR/MM/DD'),'xuseralias11',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid12','xusernm12','xuserid12pass',to_date('2019/04/14','RRRR/MM/DD'),'xuseralias12',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid13','xusernm13','xuserid13pass',to_date('2019/04/04','RRRR/MM/DD'),'xuseralias13',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid14','xusernm14','xuserid14pass',to_date('2019/03/25','RRRR/MM/DD'),'xuseralias14',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid15','xusernm15','xuserid15pass',to_date('2019/03/15','RRRR/MM/DD'),'xuseralias15',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid16','xusernm16','xuserid16pass',to_date('2019/03/05','RRRR/MM/DD'),'xuseralias16',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid17','xusernm17','xuserid17pass',to_date('2019/02/23','RRRR/MM/DD'),'xuseralias17',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid18','xusernm18','xuserid18pass',to_date('2019/02/13','RRRR/MM/DD'),'xuseralias18',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid19','xusernm19','xuserid19pass',to_date('2019/02/03','RRRR/MM/DD'),'xuseralias19',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid20','xusernm20','xuserid20pass',to_date('2019/01/24','RRRR/MM/DD'),'xuseralias20',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid21','xusernm21','xuserid21pass',to_date('2019/01/14','RRRR/MM/DD'),'xuseralias21',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid22','xusernm22','xuserid22pass',to_date('2019/01/04','RRRR/MM/DD'),'xuseralias22',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid23','xusernm23','xuserid23pass',to_date('2018/12/25','RRRR/MM/DD'),'xuseralias23',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid24','xusernm24','xuserid24pass',to_date('2018/12/15','RRRR/MM/DD'),'xuseralias24',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid25','xusernm25','xuserid25pass',to_date('2018/12/05','RRRR/MM/DD'),'xuseralias25',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid26','xusernm26','xuserid26pass',to_date('2018/11/25','RRRR/MM/DD'),'xuseralias26',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid27','xusernm27','xuserid27pass',to_date('2018/11/15','RRRR/MM/DD'),'xuseralias27',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid28','xusernm28','xuserid28pass',to_date('2018/11/05','RRRR/MM/DD'),'xuseralias28',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid29','xusernm29','xuserid29pass',to_date('2018/10/26','RRRR/MM/DD'),'xuseralias29',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid30','xusernm30','xuserid30pass',to_date('2018/10/16','RRRR/MM/DD'),'xuseralias30',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid31','xusernm31','xuserid31pass',to_date('2018/10/06','RRRR/MM/DD'),'xuseralias31',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid32','xusernm32','xuserid32pass',to_date('2018/09/26','RRRR/MM/DD'),'xuseralias32',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid33','xusernm33','xuserid33pass',to_date('2018/09/16','RRRR/MM/DD'),'xuseralias33',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid34','xusernm34','xuserid34pass',to_date('2018/09/06','RRRR/MM/DD'),'xuseralias34',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid35','xusernm35','xuserid35pass',to_date('2018/08/27','RRRR/MM/DD'),'xuseralias35',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid36','xusernm36','xuserid36pass',to_date('2018/08/17','RRRR/MM/DD'),'xuseralias36',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid37','xusernm37','xuserid37pass',to_date('2018/08/07','RRRR/MM/DD'),'xuseralias37',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid38','xusernm38','xuserid38pass',to_date('2018/07/28','RRRR/MM/DD'),'xuseralias38',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid39','xusernm39','xuserid39pass',to_date('2018/07/18','RRRR/MM/DD'),'xuseralias39',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid40','xusernm40','xuserid40pass',to_date('2018/07/08','RRRR/MM/DD'),'xuseralias40',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid41','xusernm41','xuserid41pass',to_date('2018/06/28','RRRR/MM/DD'),'xuseralias41',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid42','xusernm42','xuserid42pass',to_date('2018/06/18','RRRR/MM/DD'),'xuseralias42',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid43','xusernm43','xuserid43pass',to_date('2018/06/08','RRRR/MM/DD'),'xuseralias43',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid44','xusernm44','xuserid44pass',to_date('2018/05/29','RRRR/MM/DD'),'xuseralias44',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid45','xusernm45','xuserid45pass',to_date('2018/05/19','RRRR/MM/DD'),'xuseralias45',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid46','xusernm46','xuserid46pass',to_date('2018/05/09','RRRR/MM/DD'),'xuseralias46',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid47','xusernm47','xuserid47pass',to_date('2018/04/29','RRRR/MM/DD'),'xuseralias47',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid48','xusernm48','xuserid48pass',to_date('2018/04/19','RRRR/MM/DD'),'xuseralias48',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid49','xusernm49','xuserid49pass',to_date('2018/04/09','RRRR/MM/DD'),'xuseralias49',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid50','xusernm50','xuserid50pass',to_date('2018/03/30','RRRR/MM/DD'),'xuseralias50',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid51','xusernm51','xuserid51pass',to_date('2018/03/20','RRRR/MM/DD'),'xuseralias51',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid52','xusernm52','xuserid52pass',to_date('2018/03/10','RRRR/MM/DD'),'xuseralias52',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid53','xusernm53','xuserid53pass',to_date('2018/02/28','RRRR/MM/DD'),'xuseralias53',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid54','xusernm54','xuserid54pass',to_date('2018/02/18','RRRR/MM/DD'),'xuseralias54',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid55','xusernm55','xuserid55pass',to_date('2018/02/08','RRRR/MM/DD'),'xuseralias55',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid56','xusernm56','xuserid56pass',to_date('2018/01/29','RRRR/MM/DD'),'xuseralias56',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid57','xusernm57','xuserid57pass',to_date('2018/01/19','RRRR/MM/DD'),'xuseralias57',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid58','xusernm58','xuserid58pass',to_date('2018/01/09','RRRR/MM/DD'),'xuseralias58',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid59','xusernm59','xuserid59pass',to_date('2017/12/30','RRRR/MM/DD'),'xuseralias59',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid60','xusernm60','xuserid60pass',to_date('2017/12/20','RRRR/MM/DD'),'xuseralias60',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid61','xusernm61','xuserid61pass',to_date('2017/12/10','RRRR/MM/DD'),'xuseralias61',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid62','xusernm62','xuserid62pass',to_date('2017/11/30','RRRR/MM/DD'),'xuseralias62',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid63','xusernm63','xuserid63pass',to_date('2017/11/20','RRRR/MM/DD'),'xuseralias63',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid64','xusernm64','xuserid64pass',to_date('2017/11/10','RRRR/MM/DD'),'xuseralias64',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid65','xusernm65','xuserid65pass',to_date('2017/10/31','RRRR/MM/DD'),'xuseralias65',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid66','xusernm66','xuserid66pass',to_date('2017/10/21','RRRR/MM/DD'),'xuseralias66',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid67','xusernm67','xuserid67pass',to_date('2017/10/11','RRRR/MM/DD'),'xuseralias67',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid68','xusernm68','xuserid68pass',to_date('2017/10/01','RRRR/MM/DD'),'xuseralias68',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid69','xusernm69','xuserid69pass',to_date('2017/09/21','RRRR/MM/DD'),'xuseralias69',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid70','xusernm70','xuserid70pass',to_date('2017/09/11','RRRR/MM/DD'),'xuseralias70',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid71','xusernm71','xuserid71pass',to_date('2017/09/01','RRRR/MM/DD'),'xuseralias71',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid72','xusernm72','xuserid72pass',to_date('2017/08/22','RRRR/MM/DD'),'xuseralias72',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid73','xusernm73','xuserid73pass',to_date('2017/08/12','RRRR/MM/DD'),'xuseralias73',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid74','xusernm74','xuserid74pass',to_date('2017/08/02','RRRR/MM/DD'),'xuseralias74',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid75','xusernm75','xuserid75pass',to_date('2017/07/23','RRRR/MM/DD'),'xuseralias75',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid76','xusernm76','xuserid76pass',to_date('2017/07/13','RRRR/MM/DD'),'xuseralias76',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid77','xusernm77','xuserid77pass',to_date('2017/07/03','RRRR/MM/DD'),'xuseralias77',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid78','xusernm78','xuserid78pass',to_date('2017/06/23','RRRR/MM/DD'),'xuseralias78',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid79','xusernm79','xuserid79pass',to_date('2017/06/13','RRRR/MM/DD'),'xuseralias79',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid80','xusernm80','xuserid80pass',to_date('2017/06/03','RRRR/MM/DD'),'xuseralias80',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid81','xusernm81','xuserid81pass',to_date('2017/05/24','RRRR/MM/DD'),'xuseralias81',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid82','xusernm82','xuserid82pass',to_date('2017/05/14','RRRR/MM/DD'),'xuseralias82',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid83','xusernm83','xuserid83pass',to_date('2017/05/04','RRRR/MM/DD'),'xuseralias83',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid84','xusernm84','xuserid84pass',to_date('2017/04/24','RRRR/MM/DD'),'xuseralias84',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid85','xusernm85','xuserid85pass',to_date('2017/04/14','RRRR/MM/DD'),'xuseralias85',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid86','xusernm86','xuserid86pass',to_date('2017/04/04','RRRR/MM/DD'),'xuseralias86',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid87','xusernm87','xuserid87pass',to_date('2017/03/25','RRRR/MM/DD'),'xuseralias87',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid88','xusernm88','xuserid88pass',to_date('2017/03/15','RRRR/MM/DD'),'xuseralias88',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid89','xusernm89','xuserid89pass',to_date('2017/03/05','RRRR/MM/DD'),'xuseralias89',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid90','xusernm90','xuserid90pass',to_date('2017/02/23','RRRR/MM/DD'),'xuseralias90',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid91','xusernm91','xuserid91pass',to_date('2017/02/13','RRRR/MM/DD'),'xuseralias91',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid92','xusernm92','xuserid92pass',to_date('2017/02/03','RRRR/MM/DD'),'xuseralias92',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid93','xusernm93','xuserid93pass',to_date('2017/01/24','RRRR/MM/DD'),'xuseralias93',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid94','xusernm94','xuserid94pass',to_date('2017/01/14','RRRR/MM/DD'),'xuseralias94',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid95','xusernm95','xuserid95pass',to_date('2017/01/04','RRRR/MM/DD'),'xuseralias95',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid96','xusernm96','xuserid96pass',to_date('2016/12/25','RRRR/MM/DD'),'xuseralias96',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid97','xusernm97','xuserid97pass',to_date('2016/12/15','RRRR/MM/DD'),'xuseralias97',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid98','xusernm98','xuserid98pass',to_date('2016/12/05','RRRR/MM/DD'),'xuseralias98',null,null,null,null,null,null);
Insert into USERS (USERID,USERNM,PASS,REG_DT,ALIAS,ADDR1,ADDR2,ZIPCODE,FILENAME,REALFILENAME,REALFILENAME2) values ('xuserid99','xusernm99','xuserid99pass',to_date('2016/11/25','RRRR/MM/DD'),'xuseralias99',null,null,null,null,null,null);



commit;