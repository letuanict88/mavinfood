import org.craftercms.sites.editorial.MailService

println "Processing Contact Us Request with values:"
println params

def service = new MailService()
// SMTP server information:
service.setHost('pro50.emailserver.vn')
service.setPort('587')
service.setEncoding('utf-8')

service.sendEmail("contact@mavinfood.com", "online@mavinfood.com", null, 
                  "HauTK" ,"<strong>Họ Tên: </strong>" + "hau tk" + "<br/>" + "<strong>Email: </strong>" + "params.email" +"<br/>" + "<strong>Số điện thoại: </strong>" 
                  + "params.phone" + "<br/>" +"<strong>Tên công ty: </strong>" 
                  + "params.company" + "<br/>" + "<strong>Nội dung: </strong>" + "params.content")


def result=[:]
result.success = true
return result