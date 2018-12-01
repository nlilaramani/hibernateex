/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  itexps
 * Created: Dec 1, 2018
 */
CREATE TABLE [dbo].[USERS](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[fname] [varchar](50) NULL,
	[lname] [varchar](50) NULL,
	[username] [varchar](50) NULL,
	[password] [varchar](50) NULL,
	[email] [varchar](255) NULL,
	[dob] [date] NULL
) ON [PRIMARY]
