<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>login</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="file2.css">
</head>
<body>
  <div>

  </div>
    <section class="h-100 gradient-form" style="background-color: #eee;">
        <div class="container py-5 h-100">
          <div class="row d-flex justify-content-center align-items-center h-100">
            <div class="col-xl-10">
              <div class="card rounded-3 text-black">
                <div class="row g-0">
                  <div class="col-lg-6">
                    <div class="card-body p-md-5 mx-md-4">
      
                      <div class="text-center">
                        <img src="img/WhatsApp Image 2023-03-29 at 01.29.25.jpg"
                          style="width: 185px;" alt="logo">
                        <h4 class="mt-1 mb-5 pb-1"> The 
                            आश्रय HOMESTAY </h4>
                      </div>
      
                      <form action="login" method="post">
                        <p>Please login to your account</p>
      
                        <div class="form-outline mb-4">
                          <input type="email" name="fo" class="form-control"
                            placeholder="Phone number or email address" />
                          <label class="form-label" for="fo">Username</label>
                        </div>
      
                        <div class="form-outline mb-4">
                          <input type="password"  name="for" class="form-control" />
                          <label class="form-label" for="for">Password</label>
                        </div>
      
                        <div class="text-center pt-1 mb-5 pb-1">
                          <button class="btn btn-primary btn-block fa-lg gradient-custom-2 mb-3" type="Login">Log
                            in</button>
                          <a class="text-muted" href="#!">Forgot password?</a>
                        </div>
      
                        <div class="d-flex align-items-center justify-content-center pb-4">
                          <p class="mb-0 me-2">Don't have an account?</p>
                          <a href="registration.html" class="btn btn-secondary">Create new</a>
                         </div>
      
                      </form>
      
                    </div>
                  </div>
                  <div class="col-lg-6 d-flex align-items-center gradient-custom-2">
                    <div class="text-white px-3 py-4 p-md-5 mx-md-4">
                      <h4 class="mb-4">आश्रय HOMESTAY</h4>
                      <p class="small mb-0">
                        Placed at a distance of 12 km from the Shiva Temple,आश्रय, PAURI GARHWAL Uttarakhand offers free breakfast and Wi-Fi connectivity to
                         its patrons. The property in PAURI Uttarakhand is accessible from the PAURI BUS top, which is 6 km away.Arranged in two floors, 
                        the homestay in PAURI Uttarakhand accommodate s a total of 30 well-maintained rooms that are equipped with essential requisites.</p>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </section>
    
</body>
</html>