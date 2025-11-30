# build stage
FROM node:24-alpine AS build
WORKDIR /app
COPY vue-client/package*.json ./
RUN npm install
COPY vue-client/* .
RUN npm install
RUN npm run build

# production stage
FROM nginx:stable-alpine AS production
COPY --from=build /app/dist /usr/share/nginx/html
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]