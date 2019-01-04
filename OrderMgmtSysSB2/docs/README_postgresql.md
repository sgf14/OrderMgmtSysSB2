Purpose: PostgreSQL startup and troubleshooting notes.  System is RDB, pretty similar to MySQL.  seems to work ok after some
  initial teething problems w/ local host deployment.
  
QuickStart:
1) UI- PGAdmin is SQL editor for Postgres.  Launch from Start bar Postgre 11/ select PD Admin icon.
	it opens a browser window and connects to established dbs [as long as docker instance is launched]
2) See Docker notes for downloading to docker local instance.  
	Dont really need Editor for this, but found it helpful in troubleshooting.
3) There is a local instance that came  as part of PG admin download and the docker instance as of Nov 18.

Docker DB instance Quickstart:  if you had to delete your appData/roaming to get it to work, then docker conn needs to be re-established
1) Start docker container.  open pgAdmin/server/right click new server 
2) enter name 'docker' on 1st tab
3) host = 192.168.99.100 [validate ip via docker]
4) user = dbuser
5) password = password
6) leave rest of settings at default- should estb conn once you save this.

Details:  both GUI and cli versions

GUI- PG Admin- Initial Launch/install/uninstall issues
11/27/18: was having trouble with initial downloads, but seems to be fixed now.  added below for reference
was getting an intermittent fatal error- cannot contact application server error after downloading.
attempted with both version 11 and 10, but same thing happened.  was able to get this launched ok after
1) in postgres ..pgadmin4/web/config_distro.py file and changing SERVER from True to False.  Edited in Notepad- note that you have to be admin to do this
2) clear contents of AppData/Roaming/pgadmin4.  it will recreate upon re-launch.  note this is a hidden folder.  in Explorer need to click/show hidden folders to see it
these 2 steps seemed to clear the error and allowed app to launch ok.

I think the java creation thing in application.properties may have been causing some performance issues.  It was taking a ton of disk drive activity and was exceeding slow to respond.  commented that out in java, un-installed postgres 10 app, then re installed new 11 instance and disk drive performance issues seemed to be fixed.

the upshot of this is that its probably better to run a db script and create the table rather than letting java do it programmatically.  the only reason the online tutorial did that was to avoid getting into postgres startup issues.  but you would never do this in production anyway, its just a method to allow development/ proactive type stuff as a setting.

CLI- 
Added postgres to system environmentals.  key command = psql
type psql --help for command list.
note its psql -V [capital] for basic version check
login = dbuser password = password
or postgres. password = admin
note that Scott [the default] is not setup. need to change this

ie cmd: psql -l -U dbuser [lists databases, logging in as dbuser- will prompt ofr password'