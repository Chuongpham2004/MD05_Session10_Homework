# QuickBite API Gateway - Nginx với cấu hình định tuyến đóng gói sẵn trong image
FROM nginx:1.29-alpine

RUN rm /etc/nginx/conf.d/default.conf
COPY nginx.conf /etc/nginx/conf.d/gateway.conf

EXPOSE 80

HEALTHCHECK --interval=10s --timeout=3s --retries=3 \
  CMD wget -qO- http://127.0.0.1/ >/dev/null || exit 1
