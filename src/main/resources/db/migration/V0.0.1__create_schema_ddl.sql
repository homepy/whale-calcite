CREATE DATABASE IF NOT EXISTS `cspdb` DEFAULT CHARACTER SET utf8mb4 DEFAULT COLLATE utf8mb4_general_ci;



CREATE TABLE IF NOT EXISTS `cspdb`.`csp_pbc_main` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `reportid` varchar(22) NOT NULL                          COMMENT '报告编号',
  `certi_no` varchar(18) NOT NULL                          COMMENT '被查询者证件号码',
  `name` varchar(42) NOT NULL                              COMMENT '被查询者姓名',
  `address` varchar(120) DEFAULT NULL                      COMMENT '通讯地址',
  `homephone` varchar(120) DEFAULT NULL                    COMMENT '住宅电话',
  `compphone` varchar(30) DEFAULT NULL                     COMMENT '单位电话',
  `mobile` varchar(30) DEFAULT NULL                        COMMENT '手机号码',
  `org_count` varchar(2) DEFAULT NULL                      COMMENT '贷记卡发卡机构数',
  `querytime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '查询时间',
  `depositpath` varchar(120) DEFAULT NULL                  COMMENT '人行报告存放路径',
  `rpthtml` blob                                           COMMENT '人行报告内容',
  `wedst` varchar(30) DEFAULT NULL                         COMMENT '婚姻状况',
  `mate_name` varchar(60) DEFAULT NULL                     COMMENT '配偶姓名',
  `mate_certp` varchar(45) DEFAULT NULL                    COMMENT '配偶证件类型',
  `mate_cerno` varchar(45) DEFAULT NULL                    COMMENT '配偶证件号码',
  `mate_corp` varchar(99) DEFAULT NULL                     COMMENT '配偶工作单位',
  `mate_phone` varchar(30) DEFAULT NULL                    COMMENT '配偶联系电话',
  `wed_gettime` varchar(10) DEFAULT NULL                   COMMENT '婚姻信息猎取时间',
  `banknum` varchar(2) DEFAULT NULL                        COMMENT '银行授信机构数',
  `banksum` varchar(15) DEFAULT NULL                       COMMENT '银行授信额度',
  `creditnum` varchar(2) DEFAULT NULL                      COMMENT '信用卡发卡机构数',
  `creditsum` varchar(15) DEFAULT NULL                     COMMENT '信用卡信用额度',
  `org_sum` varchar(15) DEFAULT NULL                       COMMENT '贷记卡信用额度',
  `bankapsum` varchar(12) DEFAULT NULL                     COMMENT '银行法人机构数',
  `creditapnum` varchar(12) DEFAULT NULL                   COMMENT '信用卡法人机构数',
  `orgapnum` varchar(12) DEFAULT NULL                      COMMENT '贷记卡法人机构数',
  `creditodnum` varchar(12) DEFAULT NULL                   COMMENT '信用卡透支额度',
  `creditxodnum180` varchar(12) DEFAULT NULL               COMMENT '准贷记卡透支180天以上未付余额',
  `bankacc_num` varchar(12) DEFAULT NULL                   COMMENT '银行授信账户数',
  `bank_balance` varchar(15) DEFAULT NULL                  COMMENT '银行授信余额',
  `other_assure` varchar(12) DEFAULT NULL                  COMMENT '为他人贷款合同担保余额',
  `creditacc_num` varchar(12) DEFAULT NULL                 COMMENT '信用卡账户数',
  `orgacc_num` varchar(12) DEFAULT NULL                    COMMENT '贷记卡账户数',
  `org_balance` varchar(15) DEFAULT NULL                   COMMENT '贷记卡已使用余额',
  `zorg_num` varchar(12) DEFAULT NULL                      COMMENT '准贷记卡帐户数',
  `zorgfr_count` varchar(2) DEFAULT NULL                   COMMENT '准贷记卡发卡法人机构数',
  `zorg_count` varchar(2) DEFAULT NULL                     COMMENT '准贷记卡发卡机构数',
  `zorg_sum` varchar(15) DEFAULT NULL                      COMMENT '准贷记卡信用额度',
  `zorg_balance` varchar(12) DEFAULT NULL                  COMMENT '准贷记卡透支余额',
  `loan_num` varchar(12) DEFAULT NULL                      COMMENT '贷款笔数',
  `loan_corpnum` varchar(12) DEFAULT NULL                  COMMENT '贷款法人机构数',
  `loan_orgnum` varchar(12) DEFAULT NULL                   COMMENT '贷款机构数',
  `loan_money` varchar(15) DEFAULT NULL                    COMMENT '贷款合同金额',
  `loan_balance` varchar(15) DEFAULT NULL                  COMMENT '贷款余额',
  `overdue_sum` varchar(12) DEFAULT NULL                   COMMENT '当前贷款逾期总额',
  `report_date` varchar(20) DEFAULT NULL                   COMMENT '报告时间',
  `sex` varchar(128) DEFAULT NULL                          COMMENT '性别',
  `certi_type` varchar(128) DEFAULT NULL                   COMMENT '证件类型',
  `birth_date` varchar(10) DEFAULT NULL                    COMMENT '出生日期',
  `qualification` varchar(128) DEFAULT NULL                COMMENT '最高学历',
  `degree` varchar(128) DEFAULT NULL                       COMMENT '最高学位',
  `reside_addr` varchar(128) DEFAULT NULL                  COMMENT '户籍地址',
  `email` varchar(128) DEFAULT NULL                        COMMENT '电子邮箱',
  `zip` varchar(50) DEFAULT NULL                           COMMENT '邮政编码',
  `query_result` varchar(30) DEFAULT NULL                  COMMENT '查询结果',
  `nationality` varchar(100) DEFAULT NULL                  COMMENT '国籍', 
  `employ_type` varchar(120) DEFAULT NULL                  COMMENT '就业状况',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB COMMENT='人行报告主信息表';